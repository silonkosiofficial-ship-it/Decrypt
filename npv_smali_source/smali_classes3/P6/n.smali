.class abstract LP6/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP6/n$a;,
        LP6/n$b;
    }
.end annotation


# instance fields
.field private final a:[B

.field private final b:Ljava/lang/Long;


# direct methods
.method private constructor <init>([BLjava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/n;->a:[B

    iput-object p2, p0, LP6/n;->b:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>([BLjava/lang/Long;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LP6/n;-><init>([BLjava/lang/Long;)V

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    iget-object v0, p0, LP6/n;->a:[B

    return-object v0
.end method

.method public final b()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, LP6/n;->b:Ljava/lang/Long;

    return-object v0
.end method
