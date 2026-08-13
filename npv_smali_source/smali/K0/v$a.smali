.class final LK0/v$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/v;-><init>(Ljava/lang/String;Lx7/p;ILy7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LK0/v$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK0/v$a;

    invoke-direct {v0}, LK0/v$a;-><init>()V

    sput-object v0, LK0/v$a;->D:LK0/v$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    if-nez p1, :cond_0

    move-object p1, p2

    :cond_0
    return-object p1
.end method
