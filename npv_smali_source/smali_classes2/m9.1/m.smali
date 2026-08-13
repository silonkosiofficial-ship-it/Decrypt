.class public final Lm9/m;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# static fields
.field public static final D:Lm9/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/m;

    invoke-direct {v0}, Lm9/m;-><init>()V

    sput-object v0, Lm9/m;->D:Lm9/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "There is more input to consume"

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm9/m;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
