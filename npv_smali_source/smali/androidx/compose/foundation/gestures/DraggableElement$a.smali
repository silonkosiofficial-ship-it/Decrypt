.class final Landroidx/compose/foundation/gestures/DraggableElement$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/gestures/DraggableElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/foundation/gestures/DraggableElement$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/DraggableElement$a;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/DraggableElement$a;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/DraggableElement$a;->D:Landroidx/compose/foundation/gestures/DraggableElement$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;)Ljava/lang/Boolean;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/B;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/DraggableElement$a;->a(Lz0/B;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
