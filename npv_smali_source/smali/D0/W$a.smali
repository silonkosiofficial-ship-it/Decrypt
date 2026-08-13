.class final LD0/W$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LD0/W$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD0/W$a;

    invoke-direct {v0}, LD0/W$a;-><init>()V

    sput-object v0, LD0/W$a;->D:LD0/W$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LD0/V;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD0/W$a;->a()LD0/V;

    move-result-object v0

    return-object v0
.end method
