.class LN4/M$a$a;
.super LN4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN4/M$a;->d()LN4/S;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final E:Ljava/util/Iterator;

.field final F:Ljava/util/Iterator;

.field final synthetic G:LN4/M$a;


# direct methods
.method constructor <init>(LN4/M$a;)V
    .locals 1

    iput-object p1, p0, LN4/M$a$a;->G:LN4/M$a;

    invoke-direct {p0}, LN4/b;-><init>()V

    iget-object v0, p1, LN4/M$a;->C:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, LN4/M$a$a;->E:Ljava/util/Iterator;

    iget-object p1, p1, LN4/M$a;->D:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LN4/M$a$a;->F:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method protected b()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, LN4/M$a$a;->E:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LN4/M$a$a;->E:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LN4/M$a$a;->F:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LN4/M$a$a;->F:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LN4/M$a$a;->G:LN4/M$a;

    iget-object v1, v1, LN4/M$a;->C:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_1
    invoke-virtual {p0}, LN4/b;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
