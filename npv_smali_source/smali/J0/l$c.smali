.class final LJ0/l$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ0/l;->d(Landroid/view/View;LK0/q;Lm7/i;Ljava/util/function/Consumer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LJ0/l$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/l$c;

    invoke-direct {v0}, LJ0/l$c;-><init>()V

    sput-object v0, LJ0/l$c;->D:LJ0/l$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/m;)Ljava/lang/Comparable;
    .locals 0

    invoke-virtual {p1}, LJ0/m;->d()LY0/r;

    move-result-object p1

    invoke-virtual {p1}, LY0/r;->f()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/m;

    invoke-virtual {p0, p1}, LJ0/l$c;->a(LJ0/m;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1
.end method
