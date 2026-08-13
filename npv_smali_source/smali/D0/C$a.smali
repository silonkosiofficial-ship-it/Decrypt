.class final LD0/C$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Lx7/p;

.field private c:LV/b1;

.field private d:Z

.field private e:Z

.field private f:LV/w0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lx7/p;LV/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/C$a;->a:Ljava/lang/Object;

    iput-object p2, p0, LD0/C$a;->b:Lx7/p;

    iput-object p3, p0, LD0/C$a;->c:LV/b1;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LD0/C$a;->f:LV/w0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lx7/p;LV/b1;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LD0/C$a;-><init>(Ljava/lang/Object;Lx7/p;LV/b1;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, LD0/C$a;->f:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final b()LV/b1;
    .locals 1

    iget-object v0, p0, LD0/C$a;->c:LV/b1;

    return-object v0
.end method

.method public final c()Lx7/p;
    .locals 1

    iget-object v0, p0, LD0/C$a;->b:Lx7/p;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LD0/C$a;->d:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LD0/C$a;->e:Z

    return v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD0/C$a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final g(Z)V
    .locals 1

    iget-object v0, p0, LD0/C$a;->f:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(LV/w0;)V
    .locals 0

    iput-object p1, p0, LD0/C$a;->f:LV/w0;

    return-void
.end method

.method public final i(LV/b1;)V
    .locals 0

    iput-object p1, p0, LD0/C$a;->c:LV/b1;

    return-void
.end method

.method public final j(Lx7/p;)V
    .locals 0

    iput-object p1, p0, LD0/C$a;->b:Lx7/p;

    return-void
.end method

.method public final k(Z)V
    .locals 0

    iput-boolean p1, p0, LD0/C$a;->d:Z

    return-void
.end method

.method public final l(Z)V
    .locals 0

    iput-boolean p1, p0, LD0/C$a;->e:Z

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LD0/C$a;->a:Ljava/lang/Object;

    return-void
.end method
