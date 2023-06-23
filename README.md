# EASY-TASKER
This is a demo rest api task tracker service

Work in progress

## Service Entities
<details><summary>TASK</summary>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Task is the main entity of the service. Task can have multiple subtasks.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;When Task is deleted, all of its subtasks are deleted too.
</details>
<details><summary>SUBTASK</summary>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Subtask is a dependent entity, i.e. it does not exist on its own, only on a Task.
</details>
