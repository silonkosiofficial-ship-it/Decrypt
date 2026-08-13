.class public final LU7/y;
.super LU7/t;
.source "SourceFile"

# interfaces
.implements Le8/w;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "recordComponent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU7/t;-><init>()V

    iput-object p1, p0, LU7/y;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public Y()Ljava/lang/reflect/Member;
    .locals 2

    .prologue
    sget-object v0, LU7/a;->a:LU7/a;

    iget-object v1, p0, LU7/y;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LU7/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/NoSuchMethodError;

    const-string v1, "Can\'t find `getAccessor` method"

    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getType()Le8/x;
    .locals 2

    .prologue
    sget-object v0, LU7/a;->a:LU7/a;

    iget-object v1, p0, LU7/y;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LU7/a;->d(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LU7/n;

    invoke-direct {v1, v0}, LU7/n;-><init>(Ljava/lang/reflect/Type;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/NoSuchMethodError;

    const-string v1, "Can\'t find `getType` method"

    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
