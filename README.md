# Deploying the Sender Microservice into OpenShift
```
cd ~
git clone https://github.com/tektutor/sender-ms.git
cd sender-ms
oc apply -f sender.yml
```

# Check the pods
```
oc get po
```

# Create a clusterip internal service
```
oc expose deploy/sender-ms --port=8080
```
