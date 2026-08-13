.class public final LX7/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/EnumMap;


# direct methods
.method public constructor <init>(Ljava/util/EnumMap;)V
    .locals 1

    const-string v0, "defaultQualifiers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/y;->a:Ljava/util/EnumMap;

    return-void
.end method


# virtual methods
.method public final a(LX7/b;)LX7/r;
    .locals 1

    iget-object v0, p0, LX7/y;->a:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX7/r;

    return-object p1
.end method

.method public final b()Ljava/util/EnumMap;
    .locals 1

    iget-object v0, p0, LX7/y;->a:Ljava/util/EnumMap;

    return-object v0
.end method
