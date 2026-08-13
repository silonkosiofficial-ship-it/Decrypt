.class public final LB9/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB9/d;->c(Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/lifecycle/k;

.field final synthetic b:LB9/d$a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k;LB9/d$a;)V
    .locals 0

    iput-object p1, p0, LB9/d$d;->a:Landroidx/lifecycle/k;

    iput-object p2, p0, LB9/d$d;->b:LB9/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, LB9/d$d;->a:Landroidx/lifecycle/k;

    iget-object v1, p0, LB9/d$d;->b:LB9/d$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    return-void
.end method
