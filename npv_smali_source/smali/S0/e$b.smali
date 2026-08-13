.class final LS0/e$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS0/e;-><init>(Lz0/Q;LS0/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS0/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS0/e$b;

    invoke-direct {v0}, LS0/e$b;-><init>()V

    sput-object v0, LS0/e$b;->D:LS0/e$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([F)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/J1;

    invoke-virtual {p1}, Lo0/J1;->r()[F

    move-result-object p1

    invoke-virtual {p0, p1}, LS0/e$b;->a([F)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
