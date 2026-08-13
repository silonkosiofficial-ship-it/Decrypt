.class final LK0/l$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LK0/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK0/l$a;

    invoke-direct {v0}, LK0/l$a;-><init>()V

    sput-object v0, LK0/l$a;->D:LK0/l$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
