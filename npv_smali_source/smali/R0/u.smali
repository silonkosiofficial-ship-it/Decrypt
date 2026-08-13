.class public final LR0/u;
.super LR0/E;
.source "SourceFile"


# instance fields
.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LR0/E;-><init>(Ly7/k;)V

    iput-object p1, p0, LR0/u;->h:Ljava/lang/String;

    iput-object p2, p0, LR0/u;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LR0/u;->h:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LR0/u;->i:Ljava/lang/String;

    return-object v0
.end method
