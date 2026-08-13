.class public final synthetic Landroidx/compose/ui/platform/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic C:Lx7/p;


# direct methods
.method public synthetic constructor <init>(Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/t;->C:Lx7/p;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/t;->C:Lx7/p;

    invoke-static {v0, p1, p2}, Landroidx/compose/ui/platform/x;->o(Lx7/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
