.class final Lv/e$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/e;->j(Ll0/d;Lo0/n0;JJZF)Ll0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo0/n0;

.field final synthetic E:J

.field final synthetic F:J

.field final synthetic G:Lq0/h;


# direct methods
.method constructor <init>(Lo0/n0;JJLq0/h;)V
    .locals 0

    iput-object p1, p0, Lv/e$b;->D:Lo0/n0;

    iput-wide p2, p0, Lv/e$b;->E:J

    iput-wide p4, p0, Lv/e$b;->F:J

    iput-object p6, p0, Lv/e$b;->G:Lq0/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 12

    invoke-interface {p1}, Lq0/c;->l1()V

    iget-object v1, p0, Lv/e$b;->D:Lo0/n0;

    iget-wide v2, p0, Lv/e$b;->E:J

    iget-wide v4, p0, Lv/e$b;->F:J

    iget-object v7, p0, Lv/e$b;->G:Lq0/h;

    const/16 v10, 0x68

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v11}, Lq0/f;->l(Lq0/g;Lo0/n0;JJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, Lv/e$b;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
