.class final Li9/X$e$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/X$e;->a(Li9/o$e;)V
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

    iput-object p1, p0, Li9/X$e$b;->D:Li9/b0;

    iput-boolean p2, p0, Li9/X$e$b;->E:Z

    iput-object p3, p0, Li9/X$e$b;->F:Li9/b0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o$e;)V
    .locals 3

    const-string v0, "$this$alternativeParsing"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li9/X$e$b;->D:Li9/b0;

    iget-boolean v1, p0, Li9/X$e$b;->E:Z

    iget-object v2, p0, Li9/X$e$b;->F:Li9/b0;

    invoke-static {p1, v0, v1, v2}, Li9/X;->b(Li9/o$e;Li9/b0;ZLi9/b0;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o$e;

    invoke-virtual {p0, p1}, Li9/X$e$b;->a(Li9/o$e;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
