.class final LK0/r$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK0/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LK0/r$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK0/r$f;

    invoke-direct {v0}, LK0/r$f;-><init>()V

    sput-object v0, LK0/r$f;->D:LK0/r$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li7/M;Li7/M;)Li7/M;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/M;

    check-cast p2, Li7/M;

    invoke-virtual {p0, p1, p2}, LK0/r$f;->a(Li7/M;Li7/M;)Li7/M;

    move-result-object p1

    return-object p1
.end method
