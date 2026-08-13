.class public final Lg8/o$a;
.super Lg8/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final j:Lg8/o;


# direct methods
.method public constructor <init>(Lg8/o;)V
    .locals 1

    const-string v0, "elementType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lg8/o;-><init>(Ly7/k;)V

    iput-object p1, p0, Lg8/o$a;->j:Lg8/o;

    return-void
.end method


# virtual methods
.method public final i()Lg8/o;
    .locals 1

    iget-object v0, p0, Lg8/o$a;->j:Lg8/o;

    return-object v0
.end method
