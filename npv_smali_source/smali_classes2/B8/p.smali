.class public abstract LB8/p;
.super LB8/o;
.source "SourceFile"


# instance fields
.field private final J:Lk8/a;

.field private final K:LD8/f;

.field private final L:Lk8/d;

.field private final M:LB8/z;

.field private N:Li8/m;

.field private O:Ly8/h;


# direct methods
.method public constructor <init>(Ln8/c;LE8/n;LO7/G;Li8/m;Lk8/a;LD8/f;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LB8/o;-><init>(Ln8/c;LE8/n;LO7/G;)V

    iput-object p5, p0, LB8/p;->J:Lk8/a;

    iput-object p6, p0, LB8/p;->K:LD8/f;

    new-instance p1, Lk8/d;

    invoke-virtual {p4}, Li8/m;->O()Li8/p;

    move-result-object p2

    const-string p3, "getStrings(...)"

    invoke-static {p2, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Li8/m;->N()Li8/o;

    move-result-object p3

    const-string p6, "getQualifiedNames(...)"

    invoke-static {p3, p6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lk8/d;-><init>(Li8/p;Li8/o;)V

    iput-object p1, p0, LB8/p;->L:Lk8/d;

    new-instance p2, LB8/z;

    new-instance p3, LB8/p$a;

    invoke-direct {p3, p0}, LB8/p$a;-><init>(LB8/p;)V

    invoke-direct {p2, p4, p1, p5, p3}, LB8/z;-><init>(Li8/m;Lk8/c;Lk8/a;Lx7/l;)V

    iput-object p2, p0, LB8/p;->M:LB8/z;

    iput-object p4, p0, LB8/p;->N:Li8/m;

    return-void
.end method

.method public static final synthetic V0(LB8/p;)LD8/f;
    .locals 0

    iget-object p0, p0, LB8/p;->K:LD8/f;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic O0()LB8/h;
    .locals 1

    invoke-virtual {p0}, LB8/p;->W0()LB8/z;

    move-result-object v0

    return-object v0
.end method

.method public U0(LB8/k;)V
    .locals 11

    .prologue
    const-string v0, "components"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/p;->N:Li8/m;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, LB8/p;->N:Li8/m;

    new-instance v1, LD8/i;

    invoke-virtual {v0}, Li8/m;->M()Li8/l;

    move-result-object v4

    const-string v0, "getPackage(...)"

    invoke-static {v4, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, LB8/p;->L:Lk8/d;

    iget-object v6, p0, LB8/p;->J:Lk8/a;

    iget-object v7, p0, LB8/p;->K:LD8/f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "scope of "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v10, LB8/p$b;

    invoke-direct {v10, p0}, LB8/p$b;-><init>(LB8/p;)V

    move-object v2, v1

    move-object v3, p0

    move-object v8, p1

    invoke-direct/range {v2 .. v10}, LD8/i;-><init>(LO7/K;Li8/l;Lk8/c;Lk8/a;LD8/f;LB8/k;Ljava/lang/String;Lx7/a;)V

    iput-object v1, p0, LB8/p;->O:Ly8/h;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Repeated call to DeserializedPackageFragmentImpl::initialize"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public W0()LB8/z;
    .locals 1

    iget-object v0, p0, LB8/p;->M:LB8/z;

    return-object v0
.end method

.method public u()Ly8/h;
    .locals 1

    .prologue
    iget-object v0, p0, LB8/p;->O:Ly8/h;

    if-nez v0, :cond_0

    const-string v0, "_memberScope"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
