
package subtask6

class FullBinaryTrees {

    fun stringForNodeCount(count: Int): String {
        if(count==1) return "[[0]]"
        if(count%2==0) return "[]"
        var result ="["
        if (count%2==1) {
            for (child in newchild("[0", count-1, 0))
                result+=child
                result+="]"
        }
        return result
    }
     fun newchild(root: String, vet: Int, node: Int): ArrayList<String>{
        if (vet==0) return arrayListOf("$root]")
        else {
            val arr = newchild("$root,0,0", vet - 2, node+1)
            if (node>0) {
                arr.addAll(newchild("$root,null,null", vet, node-1))
            }
            return arr
        }
    }
}