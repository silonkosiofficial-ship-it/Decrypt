.class public final synthetic LB9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Landroidx/lifecycle/k;

.field public final synthetic D:Le/x;

.field public final synthetic E:LB9/f;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/k;Le/x;LB9/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB9/b;->C:Landroidx/lifecycle/k;

    iput-object p2, p0, LB9/b;->D:Le/x;

    iput-object p3, p0, LB9/b;->E:LB9/f;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LB9/b;->C:Landroidx/lifecycle/k;

    iget-object v1, p0, LB9/b;->D:Le/x;

    iget-object v2, p0, LB9/b;->E:LB9/f;

    check-cast p1, LV/N;

    invoke-static {v0, v1, v2, p1}, LB9/d;->b(Landroidx/lifecycle/k;Le/x;LB9/f;LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
