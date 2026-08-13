.class final Landroidx/compose/ui/focus/m;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements Lm0/j;


# instance fields
.field private P:Lm0/l;


# direct methods
.method public constructor <init>(Lm0/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/m;->P:Lm0/l;

    return-void
.end method


# virtual methods
.method public final T1(Lm0/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/m;->P:Lm0/l;

    return-void
.end method

.method public Y(Landroidx/compose/ui/focus/j;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/m;->P:Lm0/l;

    invoke-interface {v0, p1}, Lm0/l;->a(Landroidx/compose/ui/focus/j;)V

    return-void
.end method
