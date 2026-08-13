.class final LN4/i$g;
.super LN4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "g"
.end annotation


# instance fields
.field private final C:Ljava/lang/Object;

.field private D:I

.field final synthetic E:LN4/i;


# direct methods
.method constructor <init>(LN4/i;I)V
    .locals 0

    iput-object p1, p0, LN4/i$g;->E:LN4/i;

    invoke-direct {p0}, LN4/c;-><init>()V

    invoke-static {p1, p2}, LN4/i;->b(LN4/i;I)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LN4/i$g;->C:Ljava/lang/Object;

    iput p2, p0, LN4/i$g;->D:I

    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    iget v0, p0, LN4/i$g;->D:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, LN4/i$g;->E:LN4/i;

    invoke-virtual {v1}, LN4/i;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, LN4/i$g;->C:Ljava/lang/Object;

    iget-object v1, p0, LN4/i$g;->E:LN4/i;

    iget v2, p0, LN4/i$g;->D:I

    invoke-static {v1, v2}, LN4/i;->b(LN4/i;I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LM4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, LN4/i$g;->E:LN4/i;

    iget-object v1, p0, LN4/i$g;->C:Ljava/lang/Object;

    invoke-static {v0, v1}, LN4/i;->j(LN4/i;Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, LN4/i$g;->D:I

    :cond_1
    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN4/i$g;->C:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, LN4/i$g;->E:LN4/i;

    invoke-virtual {v0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LN4/i$g;->C:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LN4/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct {p0}, LN4/i$g;->a()V

    iget v0, p0, LN4/i$g;->D:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-static {}, LN4/E;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, LN4/i$g;->E:LN4/i;

    invoke-static {v1, v0}, LN4/i;->k(LN4/i;I)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, LN4/i$g;->E:LN4/i;

    invoke-virtual {v0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LN4/i$g;->C:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LN4/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, LN4/i$g;->a()V

    iget v0, p0, LN4/i$g;->D:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LN4/i$g;->E:LN4/i;

    iget-object v1, p0, LN4/i$g;->C:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, LN4/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LN4/E;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v1, p0, LN4/i$g;->E:LN4/i;

    invoke-static {v1, v0}, LN4/i;->k(LN4/i;I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LN4/i$g;->E:LN4/i;

    iget v2, p0, LN4/i$g;->D:I

    invoke-static {v1, v2, p1}, LN4/i;->f(LN4/i;ILjava/lang/Object;)V

    return-object v0
.end method
