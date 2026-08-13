.class final Laa/s$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Laa/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/s$a;

    invoke-direct {v0}, Laa/s$a;-><init>()V

    sput-object v0, Laa/s$a;->D:Laa/s$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Laa/r;
    .locals 1

    invoke-static {}, Laa/s;->a()Laa/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laa/s$a;->a()Laa/r;

    move-result-object v0

    return-object v0
.end method
