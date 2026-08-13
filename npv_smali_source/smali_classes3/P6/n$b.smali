.class public final LP6/n$b;
.super LP6/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP6/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final c:Lx7/a;


# direct methods
.method public constructor <init>([BLx7/a;Ljava/lang/Long;)V
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provider"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p3, v0}, LP6/n;-><init>([BLjava/lang/Long;Ly7/k;)V

    iput-object p2, p0, LP6/n$b;->c:Lx7/a;

    return-void
.end method


# virtual methods
.method public final c()Lx7/a;
    .locals 1

    iget-object v0, p0, LP6/n$b;->c:Lx7/a;

    return-object v0
.end method
