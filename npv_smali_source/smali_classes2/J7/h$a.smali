.class public final LJ7/h$a;
.super LJ7/h;
.source "SourceFile"

# interfaces
.implements LJ7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "unboxMethod"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, LJ7/h;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;Ly7/k;)V

    iput-object p2, p0, LJ7/h$a;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public z([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LJ7/h;->b([Ljava/lang/Object;)V

    iget-object v0, p0, LJ7/h$a;->d:Ljava/lang/Object;

    invoke-virtual {p0, v0, p1}, LJ7/h;->a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
