.class public final Landroidx/compose/ui/platform/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/g;


# instance fields
.field private final a:Lx7/a;

.field private final synthetic b:Le0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Le0/g;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/t0;->a:Lx7/a;

    iput-object p1, p0, Landroidx/compose/ui/platform/t0;->b:Le0/g;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/t0;->b:Le0/g;

    invoke-interface {v0, p1}, Le0/g;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/t0;->b:Le0/g;

    invoke-interface {v0}, Le0/g;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/t0;->b:Le0/g;

    invoke-interface {v0, p1}, Le0/g;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/t0;->a:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public e(Ljava/lang/String;Lx7/a;)Le0/g$a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/t0;->b:Le0/g;

    invoke-interface {v0, p1, p2}, Le0/g;->e(Ljava/lang/String;Lx7/a;)Le0/g$a;

    move-result-object p1

    return-object p1
.end method
