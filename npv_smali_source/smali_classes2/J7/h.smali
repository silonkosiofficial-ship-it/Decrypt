.class public abstract LJ7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ7/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/h$a;,
        LJ7/h$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:Ljava/util/List;

.field private final c:Ljava/lang/reflect/Type;


# direct methods
.method private constructor <init>(Ljava/lang/reflect/Method;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/h;->a:Ljava/lang/reflect/Method;

    iput-object p2, p0, LJ7/h;->b:Ljava/util/List;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    const-string p2, "getReturnType(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LJ7/h;->c:Ljava/lang/reflect/Type;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Method;Ljava/util/List;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LJ7/h;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "args"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ7/h;->a:Ljava/lang/reflect/Method;

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b([Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/e$a;->a(LJ7/e;[Ljava/lang/Object;)V

    return-void
.end method

.method public final c()Ljava/lang/reflect/Method;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, LJ7/h;->c:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LJ7/h;->b:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic n()Ljava/lang/reflect/Member;
    .locals 1

    invoke-virtual {p0}, LJ7/h;->c()Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0
.end method
