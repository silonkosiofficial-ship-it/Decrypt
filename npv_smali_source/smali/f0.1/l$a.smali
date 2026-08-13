.class public final Lf0/l$a;
.super Lf0/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lf0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lf0/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf0/l;-><init>(Ly7/k;)V

    iput-object p1, p0, Lf0/l$a;->a:Lf0/k;

    return-void
.end method
