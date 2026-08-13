.class public abstract LS/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/O0;

.field private static final b:LV/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LS/k0$a;->D:LS/k0$a;

    invoke-static {v0}, LV/y;->f(Lx7/a;)LV/O0;

    move-result-object v0

    sput-object v0, LS/k0;->a:LV/O0;

    sget-object v0, LS/k0$b;->D:LS/k0$b;

    invoke-static {v0}, LV/y;->f(Lx7/a;)LV/O0;

    move-result-object v0

    sput-object v0, LS/k0;->b:LV/O0;

    return-void
.end method

.method public static final a()LV/O0;
    .locals 1

    sget-object v0, LS/k0;->b:LV/O0;

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 1

    sget-object v0, Landroidx/compose/material3/MinimumInteractiveModifier;->b:Landroidx/compose/material3/MinimumInteractiveModifier;

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
