class Solution {
public:
    int maxDepth(TreeNode* root) {
        queue <TreeNode*> q;

        if(root==NULL)
        {
            return 0;
        }
        q.push(root);
        q.push(NULL);
        int ans = 0;

        
        while(!q.empty())
        {
            TreeNode* temp = q.front();
            q.pop();

            if(temp==NULL)
            {
                ans++;
                if(!q.empty())
                {
                    q.push(NULL);
                }
            }
            else
            {
                if(temp->left)
                {
                    q.push(temp->left);
                }
                if(temp->right)
                {
                    q.push(temp->right);
                }
            }
        }

        return ans;
    }
};
