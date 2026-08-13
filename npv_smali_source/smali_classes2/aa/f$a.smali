.class final Laa/f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Laa/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/f$a;

    invoke-direct {v0}, Laa/f$a;-><init>()V

    sput-object v0, Laa/f$a;->D:Laa/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lo0/E1;
    .locals 7

    const/16 v5, 0x1c

    const/4 v6, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lo0/G1;->b(IIIZLp0/c;ILjava/lang/Object;)Lo0/E1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laa/f$a;->a()Lo0/E1;

    move-result-object v0

    return-object v0
.end method
