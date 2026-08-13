.class final LS0/Z$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS0/Z;-><init>(Landroid/view/View;Lz0/Q;LS0/u;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS0/Z$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS0/Z$e;

    invoke-direct {v0}, LS0/Z$e;-><init>()V

    sput-object v0, LS0/Z$e;->D:LS0/Z$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LS0/Z$e;->a(Ljava/util/List;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
