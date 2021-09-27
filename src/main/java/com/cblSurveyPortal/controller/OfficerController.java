package com.cblSurveyPortal.controller;

import com.cblSurveyPortal.constant.HttpHeader;
import com.cblSurveyPortal.dto.OfficerCreateDTO;
import com.cblSurveyPortal.dto.OfficerUpdateDTO;
import com.cblSurveyPortal.dto.ResponseDTO;
import com.cblSurveyPortal.model.dummy.User;
import com.cblSurveyPortal.service.OfficerService;
import com.cblSurveyPortal.utills.Utils;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OfficerController {
    @Autowired
    private OfficerService officerService;
    @RequestMapping(value = "/officer/create", method = RequestMethod.POST)
    public ResponseDTO create(@RequestBody OfficerCreateDTO input, @RequestHeader(value = HttpHeader.REQUESTER) String requesterStr)
    {
        User requester = Utils.generateUserFromJsonStr(requesterStr);
        ResponseDTO result = officerService.create(input,requester);
        return result;
    }

    @RequestMapping(value = "/officer/get-list",method = RequestMethod.GET)
    public ResponseDTO getList(@RequestHeader(value = HttpHeader.REQUESTER) String requesterStr)
    {
        User requester = Utils.generateUserFromJsonStr(requesterStr);
        ResponseDTO result = officerService.getList();
        return result;
    }

    @RequestMapping(value = "/officer/get/{id}",method = RequestMethod.GET)
    public ResponseDTO get(@PathVariable("id") ObjectId id, @RequestHeader(value = HttpHeader.REQUESTER) String requesterStr)
    {
        User requester = Utils.generateUserFromJsonStr(requesterStr);
        ResponseDTO result = officerService.get(id);
        return result;
    }

    @RequestMapping(value = "/officer/update",method = RequestMethod.PUT)
    public ResponseDTO update(@RequestBody OfficerUpdateDTO input, @RequestHeader(value = HttpHeader.REQUESTER) String requesterStr)
    {
        User requester = Utils.generateUserFromJsonStr(requesterStr);
        ResponseDTO result = officerService.update(input,requester);
        return result;
    }

    @RequestMapping(value = "/officer/delete/{id}",method = RequestMethod.DELETE)
    public ResponseDTO delete(@PathVariable("id") ObjectId id,@RequestHeader(value = HttpHeader.REQUESTER) String requesterStr)
    {
        User requester = Utils.generateUserFromJsonStr(requesterStr);
        ResponseDTO result = officerService.delete(id,requester);
        return result;
    }
}
