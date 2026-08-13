.class final LT/m$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/m;-><init>(JLY0/e;ILx7/p;ILy7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LT/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/m$a;

    invoke-direct {v0}, LT/m$a;-><init>()V

    sput-object v0, LT/m$a;->D:LT/m$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/r;LY0/r;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/r;

    check-cast p2, LY0/r;

    invoke-virtual {p0, p1, p2}, LT/m$a;->a(LY0/r;LY0/r;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
