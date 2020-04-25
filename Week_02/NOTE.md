# 学习笔记

##哈希表（Hash table）、映射、集合
    哈希表也叫散列表，是根据关键码值（Key value）而直接进行访问的数据结构。  
    它通过把关键码值映射到表中一个位置来访问记录，以加快查找的速度。   
    这个映射函数叫做散列函数（Hash Function）,存放记录的数组叫做哈希表（或散列表）。  
####哈希函数  
####哈希碰撞
+ 开放地址法，线性探查法、二次探查法、双重散列法s
+ 链值法，Java HashMap采用这种方式
####JAVA Code
+ Map HashMap TreeMap  key-value键值对，key不重复
+ Set HashSet TreeSet 不重复元素的集合

##树、二叉树、二叉搜索树
    树（Tree）是n(n>=0)个结点的有限集。n=0时称为空树。在任意一颗非空树中：
    1、有且仅有一个特定的称为根（Root）的结点；2、当n>1时，其余结点可以分为
    m(m>0)个互不相交的有限集T1、T2、T3、......、Tm，其中每一个集合本身又
    是一个颗树，并且称为根的子树（SubTree）。  
    
    结点拥有的子树数称为结点的度（Degrre）。度为0的结点称为叶节点（Leaf）或终端结点；
    度不为0的结点称为非终端结点或分支结点。除根结点之外，分支结点也称为内部结点。
    树的度是树内各结点的度的最大值。  
    
    结点的子树的根称为该结点的孩子（Child）,相应地，该结点称为孩子的双亲（Parent）。  
    同一个双亲的孩子之间互称兄弟（Sibling）。结点的祖先是从根到该结点所经分支上的所有结点。
    以某结点为根的子树中的任一结点都称为该结点的子孙。  
    
    结点的层次（Level）从根开始定义起，根为第一层，根的孩子为第二层。双亲在同一层的结点互为党兄弟。
    树中结点最大层次称为树的深度（Depth）或高度。   
    
    如果将树种结点的各子树看成从左至右是有次序的，不能互换的，则称该树为有序树，否则称为无序树。
    
    森林（Forest）是m(m>=0)颗互不相交的树的集合。
####存储结构
+ 双亲表示法
+ 孩子表示法
+ 孩子兄弟表示法
####二叉树
    二叉树（Binary Tree）是n（n>=0）个结点的有限集合，该集合或者为空集（称为空二叉树），
    或者由一个根结点和两颗互不相交的、分别称为根结点的左子树和右子树的二叉树组成。
#####特殊二叉树
+ 斜树
+ 满二叉树
+ 完全二叉树
#####二叉树的性质
+ 在二叉树的第i层上至多有2^(k-1)个结点（i>=1）
+ 深度为k的二叉树至多有2^k-1个结点（k>=1）
+ 对于任何一颗二叉树T，如果其终端结点数为n0，度为2的结点数为n2，则n0=n2+1。
+ 具有n个结点的完全二叉树的深度为|log2n| + 1 (|x|表示不大于x的最大整数)
+ 如果对一颗有n个结点的完全二叉树（其深度为|log2n|+1）的结点按层序编号
（从第1层到第|log2n|+1层，每层从左到右），对任一结点i（1<=i<=n）有：
    - 如果i=1，则终点i是二叉树的根，无双亲；如果i>1，则其双亲是结点|i/2|
    - 如果2i>n，则结点i无左孩子（结点为叶子结点）；否则其左孩子是节点2i。
    - 如果2i+1>n，则结点i无右孩子；否则其右孩子结点2i+1。
#####存储结构
+ 顺序存储结构
+ 二叉链表
#####遍历二叉树
+ 前序遍历 根 左 右
+ 中序遍历 左 根 右
+ 后序遍历 左 右 根
+ 层序遍历
#####线索二叉树
#####赫夫曼树
#####二叉搜索树 Binary Search Tree
    也称二叉排序树、有序二叉树（Ordered Binary Tree）、排序二叉树（Sorted Binary Tree）,
    是指一颗空树或者具有下列性质的二叉树：
    + 左子树上所有结点的值均小于它的根结点的值
    + 右子树所有结点的值均大于它的根结点的值
    + 以此类推：左、右子树也分别为二叉查找树。（这就是重复性）
##堆（Heap）和二叉堆
Heap:可以迅速找到一堆数中最大或者最小的数据结构。

讲根结点最大的堆叫做大顶堆或者大根堆，根结点最小的堆叫做小顶堆或小根堆。
常见的堆有二叉堆、斐波那锲堆等

###二叉堆性质
    通过完全二叉树来实现（注意：不是二叉搜索树）；
    
####二叉堆（大顶）它满足下列性质：
+ 是一颗完全树
+ 树中的任意节点的值总是>=其子节点的值；
####二叉堆实现细节
+ 二叉堆一般都通过 数组 来实现
+ 假设 第一个元素 在数组中的索引为0的话，则父节点和子节点对应关系如下
  - 索引为i左孩子的索引为2*i+1;
  - 索引为i右孩子的索引为2*i+2;
  - 索引为i的父节点的索引是floor((i-1)/2)
#####Insert 插入操作
+ 新元素一律先插入到堆的尾部
+ 依次向上调整整个堆的结构（一直到根即可） HeapifyUp
#####Delete Max 删除堆顶操作
+ 将堆尾元素替换到顶部（即对顶被替代删除掉）
+ 依次从根部向上调整整个堆的结构（一直到堆尾即可） HeapifDown  

注意：二叉堆是堆（优先队列priority_queue）的一种常见且简单的实现；但是并不是最优的实现。
 
##图
图（Graph）是由顶点的有穷非空集合和顶点之间边的集合组成，通常表示为：G(V,E)，
其中，G表示一个图，V表示图G中顶点的集合，E是图G中边的集合。
+ 无向边
+ 有向边
+ 无向完全图
+ 有向完全图
+ 稀疏图
+ 稠密图
+ 网

####存储结构
+ 邻接矩阵
+ 邻接表
+ 十字链表
+ 邻接多重表
+ 边集数组

####图的遍历
+ 深度优先遍历（Depth_First_Search）,简称DFS
```
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }
。
```
+ 广度优先遍历（Breadth_First_Search），简称BFS
```
public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;

        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    grid[r][c] = '0';
                    Queue<Integer> neighbors = new LinkedList<>();
                    neighbors.add(r * nc + c);
                    while (!neighbors.isEmpty()) {
                        int id = neighbors.remove();
                        int row = id / nc;
                        int col = id % nc;
                        if (row - 1 >= 0 && grid[row-1][col] == '1') {
                            neighbors.add((row-1) * nc + col);
                            grid[row-1][col] = '0';
                        }
                        if (row + 1 < nr && grid[row+1][col] == '1') {
                            neighbors.add((row+1) * nc + col);
                            grid[row+1][col] = '0';
                        }
                        if (col - 1 >= 0 && grid[row][col-1] == '1') {
                            neighbors.add(row * nc + col-1);
                            grid[row][col-1] = '0';
                        }
                        if (col + 1 < nc && grid[row][col+1] == '1') {
                            neighbors.add(row * nc + col+1);
                            grid[row][col+1] = '0';
                        }
                    }
                }
            }
        }

        return num_islands;
    }

```
####最小生成树
我们把构造连通网最小代价生成树称为最小生成树（Minimum Cost Spanning Tree）
+ 普里姆（Prim）算法
+ 克鲁斯卡尔（Kruskal）算法
####最短路径
+ 迪杰特斯拉（Dijkstra）算法
####t拓扑排序
在一个表示工程的有向图中，用顶点表示活动，用弧表示活动之间的优先关系，这样的有向图为顶点表示活动的网，我们称为AOV网（Activity On Vertex Network）
####关键路径