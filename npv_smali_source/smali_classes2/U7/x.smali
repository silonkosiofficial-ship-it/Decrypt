.class public final LU7/x;
.super LU7/z;
.source "SourceFile"

# interfaces
.implements Le8/v;


# instance fields
.field private final b:Ljava/lang/Class;

.field private final c:Ljava/util/Collection;

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "reflectType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU7/z;-><init>()V

    iput-object p1, p0, LU7/x;->b:Ljava/lang/Class;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iput-object p1, p0, LU7/x;->c:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public bridge synthetic X()Ljava/lang/reflect/Type;
    .locals 1

    invoke-virtual {p0}, LU7/x;->Y()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method protected Y()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LU7/x;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public getType()LL7/h;
    .locals 2

    .prologue
    invoke-virtual {p0}, LU7/x;->Y()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LU7/x;->Y()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw8/e;->i(Ljava/lang/String;)Lw8/e;

    move-result-object v0

    invoke-virtual {v0}, Lw8/e;->o()LL7/h;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public k()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LU7/x;->c:Ljava/util/Collection;

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, LU7/x;->d:Z

    return v0
.end method
