# PerfectStorms

git init
git clone https://github.com/KtoYaTo/PerfectStorms.git
git add .
git commit - "fix commit"
git push

# See branch
git status 

And we see now branch 'origin/main'

# Add new branch "develop":
git checkout -b develop

# Next step add commit develop
edit README.md 
git add .
git commit -m "develop commit"
git push origin develop

# Add new branch "fix"
git checkout -b fix

git add .
git commit -m "fix commit"
git push origin fix
