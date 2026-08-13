.class public final LT/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/a$c;->e(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/a;

.field final synthetic b:Landroidx/lifecycle/r;

.field final synthetic c:Landroidx/lifecycle/o;


# direct methods
.method public constructor <init>(Lx7/a;Landroidx/lifecycle/r;Landroidx/lifecycle/o;)V
    .locals 0

    iput-object p1, p0, LT/a$c$a;->a:Lx7/a;

    iput-object p2, p0, LT/a$c$a;->b:Landroidx/lifecycle/r;

    iput-object p3, p0, LT/a$c$a;->c:Landroidx/lifecycle/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, LT/a$c$a;->a:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    iget-object v0, p0, LT/a$c$a;->b:Landroidx/lifecycle/r;

    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v0

    iget-object v1, p0, LT/a$c$a;->c:Landroidx/lifecycle/o;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    return-void
.end method
