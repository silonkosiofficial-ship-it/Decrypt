.class final Lh2/F$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/F;-><init>(LZ8/f;Lh2/X;Lh2/o;Lx7/a;ILy7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lh2/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh2/F$a;

    invoke-direct {v0}, Lh2/F$a;-><init>()V

    sput-object v0, Lh2/F$a;->D:Lh2/F$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh2/F$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
