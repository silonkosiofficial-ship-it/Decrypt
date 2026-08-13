.class final LF8/F$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/F;->m(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;)LF8/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/e0;

.field final synthetic E:Ljava/util/List;

.field final synthetic F:LF8/a0;

.field final synthetic G:Z

.field final synthetic H:Ly8/h;


# direct methods
.method constructor <init>(LF8/e0;Ljava/util/List;LF8/a0;ZLy8/h;)V
    .locals 0

    iput-object p1, p0, LF8/F$d;->D:LF8/e0;

    iput-object p2, p0, LF8/F$d;->E:Ljava/util/List;

    iput-object p3, p0, LF8/F$d;->F:LF8/a0;

    iput-boolean p4, p0, LF8/F$d;->G:Z

    iput-object p5, p0, LF8/F$d;->H:Ly8/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LG8/g;)LF8/M;
    .locals 4

    .prologue
    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF8/F;->a:LF8/F;

    iget-object v1, p0, LF8/F$d;->D:LF8/e0;

    iget-object v2, p0, LF8/F$d;->E:Ljava/util/List;

    invoke-static {v0, v1, p1, v2}, LF8/F;->a(LF8/F;LF8/e0;LG8/g;Ljava/util/List;)LF8/F$b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, LF8/F$b;->a()LF8/M;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, LF8/F$d;->F:LF8/a0;

    invoke-virtual {p1}, LF8/F$b;->b()LF8/e0;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, LF8/F$d;->E:Ljava/util/List;

    iget-boolean v2, p0, LF8/F$d;->G:Z

    iget-object v3, p0, LF8/F$d;->H:Ly8/h;

    invoke-static {v0, p1, v1, v2, v3}, LF8/F;->m(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG8/g;

    invoke-virtual {p0, p1}, LF8/F$d;->a(LG8/g;)LF8/M;

    move-result-object p1

    return-object p1
.end method
