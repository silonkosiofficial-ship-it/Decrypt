.class final Li9/X$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/X;->f(Li9/o$e;ZZLi9/b0;Li9/b0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Li9/b0;

.field final synthetic E:Z

.field final synthetic F:Li9/b0;


# direct methods
.method constructor <init>(Li9/b0;ZLi9/b0;)V
    .locals 0

    iput-object p1, p0, Li9/X$e;->D:Li9/b0;

    iput-boolean p2, p0, Li9/X$e;->E:Z

    iput-object p3, p0, Li9/X$e;->F:Li9/b0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o$e;)V
    .locals 5

    const-string v0, "$this$optional"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lx7/l;

    sget-object v1, Li9/X$e$a;->D:Li9/X$e$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Li9/X$e$b;

    iget-object v2, p0, Li9/X$e;->D:Li9/b0;

    iget-boolean v3, p0, Li9/X$e;->E:Z

    iget-object v4, p0, Li9/X$e;->F:Li9/b0;

    invoke-direct {v1, v2, v3, v4}, Li9/X$e$b;-><init>(Li9/b0;ZLi9/b0;)V

    invoke-static {p1, v0, v1}, Li9/p;->a(Li9/o;[Lx7/l;Lx7/l;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o$e;

    invoke-virtual {p0, p1}, Li9/X$e;->a(Li9/o$e;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
