.class final LS/z0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/z0;->e(LD0/o;Ljava/util/List;I)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/z0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/z0$d;

    invoke-direct {v0}, LS/z0$d;-><init>()V

    sput-object v0, LS/z0$d;->D:LS/z0$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/n;I)Ljava/lang/Integer;
    .locals 0

    invoke-interface {p1, p2}, LD0/n;->n0(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/z0$d;->a(LD0/n;I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
