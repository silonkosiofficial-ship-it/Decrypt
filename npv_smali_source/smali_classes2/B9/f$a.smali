.class public final LB9/f$a;
.super Le/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB9/f;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:LB9/f;


# direct methods
.method constructor <init>(LB9/f;)V
    .locals 0

    iput-object p1, p0, LB9/f$a;->d:LB9/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Le/w;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    iget-object v0, p0, LB9/f$a;->d:LB9/f;

    invoke-virtual {v0}, LB9/f;->c()LF9/a;

    move-result-object v0

    invoke-virtual {v0}, LF9/a;->d()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, LB9/f$a;->d:LB9/f;

    invoke-virtual {v0}, LB9/f;->c()LF9/a;

    move-result-object v0

    invoke-virtual {v0}, LF9/a;->e()V

    return-void
.end method

.method public e(Le/b;)V
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB9/f$a;->d:LB9/f;

    invoke-virtual {v0}, LB9/f;->c()LF9/a;

    move-result-object v0

    invoke-virtual {p1}, Le/b;->a()F

    move-result p1

    invoke-virtual {v0, p1}, LF9/a;->f(F)V

    return-void
.end method

.method public f(Le/b;)V
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LB9/f$a;->d:LB9/f;

    invoke-virtual {p1}, LB9/f;->c()LF9/a;

    move-result-object p1

    invoke-virtual {p1}, LF9/a;->h()V

    return-void
.end method
