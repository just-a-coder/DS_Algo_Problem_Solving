package com.problemsolving.leetcode.bfs_dfs;

import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class EmployeeImportance_690 {
    public int getImportanceUsingBFS(List<Employee> employees, int id) {
        int result  = 0;
        Map<Integer, Employee> hmap = new HashMap<>();
        for(Employee emp: employees){
            hmap.put(emp.id,emp);
        }
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(hmap.get(id));
        while(!queue.isEmpty()){
            Employee temp = queue.poll();
            result += temp.importance;
            if(temp.subordinates!= null){
                for(Integer item:temp.subordinates){
                    queue.offer(hmap.get(item));
                }
            }
        }
        return result;
    }

    Map<Integer,Employee> emap;
    public int getImportanceUsingDFS(List<Employee> employees, int queryid) {
        emap = new HashMap<>();
        for(Employee emp: employees){
            emap.put(emp.id, emp);
        }
        return dfs(queryid);
    }

    public int dfs(int id){
        Employee e = emap.get(id);
        int result = e.importance;
        for(Integer empid: e.subordinates){
            result += dfs(empid);
        }
        return result;
    }
}
