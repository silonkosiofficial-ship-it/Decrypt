.class final Lv/S$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/S;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lv/S$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv/S$a;

    invoke-direct {v0}, Lv/S$a;-><init>()V

    sput-object v0, Lv/S$a;->D:Lv/S$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lv/Q;
    .locals 7

    new-instance v6, Lv/Q;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lv/Q;-><init>(JLA/B;ILy7/k;)V

    return-object v6
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv/S$a;->a()Lv/Q;

    move-result-object v0

    return-object v0
.end method
