.class public final LB/D$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/D;-><init>(IILB/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:LB/D;


# direct methods
.method constructor <init>(LB/D;)V
    .locals 0

    iput-object p1, p0, LB/D$f;->b:LB/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LD0/Z;)V
    .locals 1

    iget-object v0, p0, LB/D$f;->b:LB/D;

    invoke-static {v0, p1}, LB/D;->j(LB/D;LD0/Z;)V

    return-void
.end method

.method public synthetic b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Lh0/f;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/g;->b(Landroidx/compose/ui/d$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(Lx7/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lh0/g;->a(Landroidx/compose/ui/d$b;Lx7/l;)Z

    move-result p1

    return p1
.end method
