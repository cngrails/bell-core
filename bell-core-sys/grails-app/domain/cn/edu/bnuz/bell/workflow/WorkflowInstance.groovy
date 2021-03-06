package cn.edu.bnuz.bell.workflow

/**
 * 工作流实例
 * @author Yang Lin
 */
class WorkflowInstance {
    /**
     * ID
     */
    UUID id

    /**
     * 工作流
     */
    Workflow workflow

    /**
     * 标题
     */
    String title

    /**
     * 实体ID，用于生成URL
     */
    String entityId

    /**
     * 创建时间
     */
    Date dateCreated

    static hasMany = [
            workitems: Workitem
    ]

    static mapping = {
        comment     '工作流实例'
        id          generator: 'uuid2', type:'pg-uuid', comment: '消息ID'
        workflow    comment: '工作流'
        title       length: 50, comment: '标题'
        entityId    length: 32, comment: '实体ID'
        dateCreated comment: '创建时间'
    }
}
