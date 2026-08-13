.class public final Landroidx/compose/ui/platform/K1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/J1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/K1$a;
    }
.end annotation


# static fields
.field public static final b:Landroidx/compose/ui/platform/K1$a;

.field private static final c:LV/w0;


# instance fields
.field private final a:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/compose/ui/platform/K1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/K1$a;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/ui/platform/K1;->b:Landroidx/compose/ui/platform/K1$a;

    invoke-static {}, Lz0/u;->a()I

    move-result v0

    invoke-static {v0}, Lz0/O;->a(I)Lz0/O;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/platform/K1;->c:LV/w0;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/K1;->a:LV/w0;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/K1;->a:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public b(I)V
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/K1;->c:LV/w0;

    invoke-static {p1}, Lz0/O;->a(I)Lz0/O;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/K1;->a:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
