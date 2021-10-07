package com.db.group.ui.controller;

import com.db.group.service.GroupService;
import com.db.group.shared.dto.GroupDto;
import com.db.group.ui.model.request.GroupDetailsRequestModel;
import com.db.group.ui.model.response.GroupRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping//("groups")
@CrossOrigin(origins= "http://localhost:4200")
public class GroupController {

    @Autowired
    GroupService groupService;




    //create a new group
    @PostMapping("/add")
    public GroupRest createGroup(@RequestBody GroupDetailsRequestModel groupDetails){
        GroupRest returnValue = new GroupRest();
        GroupDto groupDto = new GroupDto();

        BeanUtils.copyProperties(groupDetails,groupDto);

        GroupDto createdGroup = groupService.createGroup(groupDto);
        BeanUtils.copyProperties(createdGroup, returnValue);
        return returnValue;
    }

    @PutMapping
    public String updateGroup() {
        return "Group was updated";
    }
    @DeleteMapping
    public String deleteGroup() {
        return "Group was deleted";
    }

    //Chap.72
    @GetMapping //("/list")
    //, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<GroupRest> getGroups () {
        List<GroupRest> returnValue = new ArrayList<>();

        //because service method returns Dtos
        List<GroupDto> groups = groupService.getGroups();

        for (GroupDto groupDto : groups) {
            GroupRest groupModel = new GroupRest();
            BeanUtils.copyProperties(groupDto, groupModel);
            System.out.println(groupModel.getGroupName());
            returnValue.add(groupModel);
        }
        return returnValue;
    }

    @GetMapping(path="groups-details/{groupId}")
    public GroupRest findByGroupId (@PathVariable String groupId, @RequestBody GroupDetailsRequestModel groupDetails) {
        GroupRest returnValue = new GroupRest();
        GroupDto groupDto = new GroupDto();

        BeanUtils.copyProperties(groupDetails,groupDto);

        GroupDto foundGroup = groupService.findByGroupId(groupId);
        BeanUtils.copyProperties(foundGroup, returnValue);
        return returnValue;
    }
}
