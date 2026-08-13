.class final Lv/f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/f;->b2(Ll0/d;Lo0/n0;Lo0/L1$a;ZF)Ll0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo0/L1$a;

.field final synthetic E:Lo0/n0;


# direct methods
.method constructor <init>(Lo0/L1$a;Lo0/n0;)V
    .locals 0

    iput-object p1, p0, Lv/f$a;->D:Lo0/L1$a;

    iput-object p2, p0, Lv/f$a;->E:Lo0/n0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 10

    invoke-interface {p1}, Lq0/c;->l1()V

    iget-object v0, p0, Lv/f$a;->D:Lo0/L1$a;

    invoke-virtual {v0}, Lo0/L1$a;->b()Lo0/Q1;

    move-result-object v2

    iget-object v3, p0, Lv/f$a;->E:Lo0/n0;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lq0/f;->j(Lq0/g;Lo0/Q1;Lo0/n0;FLq0/h;Lo0/z0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, Lv/f$a;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
