package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Branch;
import com.example.MiapiEnzoRH.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Branch")
public class BranchController extends BaseController<Branch, Long>{

    @Autowired
    private BranchService branchService;

    public BranchController(BranchService service) {
        super(service);
    }

    @GetMapping("/Company/{id}")
    public ResponseEntity<List<Branch>> findByCompanyId(@PathVariable Long id) throws Exception {
        List<Branch> branches = branchService.findAllByCompanyId(id);
        return ResponseEntity.ok(branches);
    }
}
